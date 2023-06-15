import React from "react";

const UpdateLocations = () => {
  return (
    <div className="formWrapper">
      <Link to="/locations" className="btn md-btn">
        Back
      </Link>
      <h2 className="formWrapper__headerText">Add Location</h2>

      <label htmlFor="">Location:</label>
      <Input type="text" placeHolder="Location" />

      <button className="btn btn-green">Add</button>
    </div>
  );
};

export default UpdateLocations;
