import React from "react";
import "./cards.css";
const ServiceCard = () => {
  return (
    <div className="card">
      <div className="one-line">
        <h3>Location: </h3>
        <p>Newyork</p>
      </div>
      <div className="one-line">
        <h3>Service: </h3>
        <p>Banking</p>
      </div>
      <div className="one-line">
        <h3>Days: </h3>
        <p>Monday-Friday</p>
      </div>
      <div className="one-line">
        <h3>Time: </h3>
        <p>08:00-17:00</p>
      </div>
    </div>
  );
};

export default ServiceCard;
