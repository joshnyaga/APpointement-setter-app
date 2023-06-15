import React from "react";
import Input from "../../components/Inputs/Input";
const Bookings = () => {
  return (
    <div className="container">
      <div className="searchbar">
        <Input type="text" placeHolder="search..." />
        <button className="btn md-btn">Search</button>
      </div>
      <table className="styled-table">
        <thead>
          <tr>
            <th>No</th>
            <th>username</th>
            <th>Service</th>
            <th>location</th>
            <th>purpose</th>
            <th>day</th>
            <th>time</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>1</td>
            <td>Joshua</td>
            <td>Bank</td>
            <td>Newyork</td>
            <td>Meet customer care</td>
            <td>Monday</td>
            <td>10:00</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
};

export default Bookings;
