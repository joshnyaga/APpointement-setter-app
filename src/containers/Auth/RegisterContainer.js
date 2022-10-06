import React, { useState, useEffect } from "react";
import "./auth.css";
import { Link } from "react-router-dom";
import axios from "axios";
const RegisterContainer = () => {
  const [input, setInput] = useState(undefined);
  const handleChange = (e) => {
    setInput((prev) => {
      return { ...prev, [e.target.name]: e.target.value };
    });
    console.log(input);
  };
  const handleRegister = async () => {
    try {
      await axios.post("http://localhost:8080/user/register", {
        ...input,
      });
      alert("Registered Successfully");
    } catch (error) {
      console.log(error);
    }
  };
  return (
    <div className="formWrapper">
      <h2 className="formWrapper__headerText">Register</h2>
      <p className="formWrapper__tagline">Get started Now !</p>
      <div className="formInput">
        <input
          type="text"
          name="username"
          placeHolder="Username"
          onChange={handleChange}
          className="formInput__input"
        />
      </div>
      <div className="formInput">
        <input
          type="email"
          name="email"
          placeHolder="Email"
          onChange={handleChange}
          className="formInput__input"
        />
      </div>
      <div className="formInput">
        <input
          type="password"
          name="password"
          placeholder="Password"
          onChange={handleChange}
          className="formInput__input"
        />
      </div>

      <div className="formOptions">
        <Link to="/login" className="formOption__forgotPassword">
          Login
        </Link>
      </div>
      <button onClick={handleRegister} className="btn btn-green">
        Register
      </button>
    </div>
  );
};

export default RegisterContainer;
