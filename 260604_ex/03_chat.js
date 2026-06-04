require("dotenv").config();

const express = require("express");
const { GoogleGenAI } = require("@google/genai")
const Groq = require("groq-sdk")


const PORT = 3434;
const app = express();
const genAI = new GoogleGenAI({apiKey: process.env.GEMINI_API_KEY});
const groq = new Groq({ apiKey: process.env.GROQ_API_KEY });

app.post("/chat/gen", (req, res) => {res.json({msg:"GoogleGenAI"});});
app.post("/chat/groq", (req, res) => {res.json({msg:"Groq"});});


app.listen(PORT,() => {console.log(`${PORT}(으)로 작동중`);});