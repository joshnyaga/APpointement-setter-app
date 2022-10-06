import React from "react";
import ServiceCard from "../../components/cards/ServiceCard";
import { Link } from "react-router-dom";
import "./service.css";
const Service = () => {
  return (
    <div className="wrapper">
      <br />
      <Link to="/admin/add-service" className="btn md-btn">
        Add Service
      </Link>
      <br />
      <div className="container-row">
        <ServiceCard />
        <ServiceCard />
        <ServiceCard />
      </div>
    </div>
  );
};

export default Service;
