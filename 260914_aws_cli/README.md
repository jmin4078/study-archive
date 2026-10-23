aws sso login --profile student13
export AWS_PROFILE="student13"
export AWS_REGION="ap-northeast-2"
export AWS_PAGER=""

# 1. 내 공인 IP 자동 감지
export MY_IP=$(curl -fsS https://checkip.amazonaws.com)
echo "내 공인 IP:$MY_IP"

# 2. SSH는 내 IP만, 웹 포트는 전역 허용
aws ec2 authorize-security-group-ingress --group-id "$MY_SG_ID" --protocol tcp --port 22 --cidr "$MY_IP/32"
aws ec2 authorize-security-group-ingress --group-id "$MY_SG_ID" --protocol tcp --port 80 --cidr 0.0.0.0/0
aws ec2 authorize-security-group-ingress --group-id "$MY_SG_ID" --protocol tcp --port 8080 --cidr 0.0.0.0/0

# 3. 등록 결과 확인
aws ec2 describe-security-groups --group-ids "$MY_SG_ID" \
--query "SecurityGroups[0].IpPermissions[].{Port:FromPort,Proto:IpProtocol,Cidr:IpRanges[0].CidrIp}" \
--output table