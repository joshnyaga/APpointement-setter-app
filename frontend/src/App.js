import logo from "./logo.svg";
import "./App.css";
import LoginContainer from "./containers/Auth/LoginContainer";
import Nav from "./components/Nav/Nav";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import BookingContainer from "./containers/Booking/BookingContainer";
import Register from "./pages/Register";
import Locations from "./pages/Locations";
import AddLocation from "./pages/AddLocation";
import ServicePage from "./pages/ServicePage";
import AdminBookings from "./pages/AdminBookings";
import NavAdmin from "./components/Nav/NavAdmin";
import AddServicePage from "./pages/AddServicePage";
function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Nav />}>
          <Route index element={<BookingContainer />} />
          <Route path="myappointments" element={<AdminBookings />} />
        </Route>
        <Route path="/admin" element={<NavAdmin />}>
          <Route index element={<AdminBookings />} />
          <Route path="locations" element={<Locations />} />
          <Route path="addlocation" element={<AddLocation />} />
          <Route path="add-service" element={<AddServicePage />} />
          <Route path="service" element={<ServicePage />} />
        </Route>
        <Route path="/login" element={<LoginContainer />} />
        <Route path="/register" element={<Register />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
