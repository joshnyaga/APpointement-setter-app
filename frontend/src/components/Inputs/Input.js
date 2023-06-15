import React from "react";
import "./input.css";
const Input = ({ type, placeHolder }) => {
  return (
    <div className="formInput">
      <input
        type={type}
        className="formInput__input"
        placeholder={placeHolder}
      />
      <span className="formInput__error"></span>
    </div>
  );
};

export default Input;
