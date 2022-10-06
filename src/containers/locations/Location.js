import React from "react";
import Input from "../../components/Inputs/Input";
import "./location.css";
import { Link } from "react-router-dom";
const Location = () => {
  return (
    <div className="container">
      <Link to="/addlocation" className="btn md-btn">
        Add Location
      </Link>
      <div className="searchbar">
        <Input type="text" placeHolder="search..." />
        <button className="btn md-btn">Search</button>
      </div>
      <table className="styled-table">
        <thead>
          <tr>
            <th>No</th>
            <th>Location</th>

            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>1</td>
            <td>Kakamega</td>

            <td>
              <div className="col-2">
                <button className="btn md-btn primary">Edit</button>{" "}
                <button className="btn md-btn danger">Delete</button>
              </div>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  );
};

export default Location;
