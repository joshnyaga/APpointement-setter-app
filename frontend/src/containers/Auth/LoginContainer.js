import React from "react";
import "./auth.css";
import Input from "../../components/Inputs/Input";
import {Link} from "react-router-dom"
const LoginContainer = () => {
  return (
    <div className="formWrapper">
      <h2 className="formWrapper__headerText">Sign in</h2>
      <p className="formWrapper__tagline">Sign in to request appointments!</p>
      <Input type="text" placeHolder="Username" />
      <Input type="password" placeHolder="Password" />
      <div className="formOptions">
        <div className="formOption__checkBox">
          <input type="checkbox" />
          <label>Remember me</label>
        </div>
        <Link to="/register" className="formOption__forgotPassword">Register</Link>
      </div>
      <button className="btn btn-green">Login</button>
    </div>
  );
};

export default LoginContainer;
