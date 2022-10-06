import React from "react";
import Input from "../../components/Inputs/Input";
import "./booking.css";
const BookingContainer = () => {
  return (
    <div className="formWrapper">
      <h2 className="formWrapper__headerText">Request an Appointment</h2>
      <p className="formWrapper__tagline">fill the form below</p>

      <label htmlFor="">Select an option</label>
      <select name="service" id="service">
        <option value="bank">Bank</option>
        <option value="hospital">Hospital</option>
      </select>
      <label htmlFor="">Select the location</label>
      <select name="location" id="location">
        <option value="bank">Newyork</option>
        <option value="hospital">MaryLand</option>
      </select>
      <label htmlFor="">Purpose</label>
      <textarea name="purpose" id="purpose" cols="30" rows="10"></textarea>
      <label htmlFor="">Date</label>
      <Input type="date" placeHolder="Date" />
      <label htmlFor="">Time</label>
      <Input type="time" placeHolder="Time" />

      <button className="btn btn-green">submit</button>
    </div>
  );
};

export default BookingContainer;
