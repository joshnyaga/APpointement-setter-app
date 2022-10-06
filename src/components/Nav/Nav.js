import React from "react";
import logo from "../../images/logo.png";
import { Link, Outlet } from "react-router-dom";
import "./nav.css";
const Nav = () => {
  return (
    <div className="nav">
      <nav>
        <div className="logo">
          <img src={logo} alt="logo" />
        </div>
        <div className="links">
          <Link href="#" className="nav-item">
            Book
          </Link>
          <Link href="#" className="nav-item">
            My Appointments
          </Link>
          <Link href="#" className="nav-item">
            Logout
          </Link>
        </div>
      </nav>
      <Outlet />
    </div>
  );
};

export default Nav;
