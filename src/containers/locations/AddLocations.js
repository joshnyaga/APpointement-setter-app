import React from "react";
import Input from "../../components/Inputs/Input";
import { Link } from "react-router-dom";
const AddLocations = () => {
  return (
    <div className="formWrapper">
      <Link to="locations" className="btn md-btn">
        Back
      </Link>
      <h2 className="formWrapper__headerText">Add Location</h2>

      <label htmlFor="">Location:</label>
      <Input type="text" placeHolder="Location" />

      <button className="btn btn-green">Add</button>
    </div>
  );
};

export default AddLocations;
