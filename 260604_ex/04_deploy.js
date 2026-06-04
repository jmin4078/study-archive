// 의존성
require("dotenv").config();
const express = require("express");
const path = require("path");
const { GoogleGenAI } = require("@google/genai");
const GroqAI = require("groq-sdk");

// 전역변수
const app = express();
const { GEMINI_API_KEY, GROQ_API_KEY, PORT } = process.env;
const google = new GoogleGenAI({ apiKey: GEMINI_API_KEY });
const groq = new GroqAI({ apiKey: GROQ_API_KEY });

app.use(express.json());

// 파일들에 대한 접근을 /public에 대해서 열어두겠다 (/public은 제외한 뒤에 경로들)
app.use(express.static(path.join(__dirname, "public")));

app.post("/chat", async (req, res) => {
  // 입력 (JSON)
  const { provider, model, ask } = req.body;
  // 로직 (AI Provider)

  // 출력 (JSON)
  res.json({
    provider,
    model,
    ask,
  });
});

app.listen(PORT, () => {
  console.log(`${PORT}에서 실행`);
});