import React from "react";
import { Link, Outlet } from "react-router-dom";
import logo from "../../images/logo.png";
const NavAdmin = () => {
  return (
    <div className="nav">
      <nav>
        <div className="logo">
          <img src={logo} alt="logo" />
        </div>
        <div className="links">
          <Link to="" className="nav-item">
            Bookings
          </Link>
          <Link to="locations" className="nav-item">
            Locations
          </Link>
          <Link to="service" className="nav-item">
            Services
          </Link>
          <Link to="#" className="nav-item">
            Logout
          </Link>
        </div>
      </nav>
      <Outlet />
    </div>
  );
};

export default NavAdmin;
