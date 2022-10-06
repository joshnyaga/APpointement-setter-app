import React from "react";
import Input from "../../components/Inputs/Input";
import { Link } from "react-router-dom";
const AddService = () => {
  return (
    <div className="formWrapper">
      <Link to="service" className="btn md-btn">
        Back
      </Link>
      <h2 className="formWrapper__headerText">Add Service</h2>
      <label htmlFor="">Select Location:</label>
      <select name="service" id="service">
        <option value="Newyork">Newyork</option>
      </select>
      <label htmlFor="">Service:</label>
      <Input type="text" placeHolder="Service" />
      <label htmlFor="">Day:</label>
      <Input type="date" placeHolder="Day" />
      <label htmlFor="">TIme:</label>
      <Input type="time" placeHolder="TIme" />

      <button className="btn btn-green">Add</button>
    </div>
  );
};

export default AddService;
