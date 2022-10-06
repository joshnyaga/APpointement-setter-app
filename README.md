To test the roots for the frontend start with
localhost:3000/login -loginpage
localhost:3000/register -register page
localhost:3000/admin/service -Admin service customization page
localhost:3000/admin/locations -Admin locations customization page
localhost:3000/admin/addlocation -Admin add locations customization page
localhost:3000/admin -Admin view All users bookings
localhost:3000 -Book appointment page

adding more...

The application should send an email to the requestor with an attached calendar invitation with the details of the appointment: date, time, location and purpose.
This application will allow the requestor to select a reason for an appointment (Bank, Hospital), then select from a list of locations and then a specific date and time.
Due to logistics some portions of the application will need to be mocked. You will need to create the locations and each location must have a separate set appointment times. The location times can be derived from a default set of appointments with the ability for customization. The appointment times must take into consideration the days of the week (i.e., Saturdays have shorter hours than weekdays.) and Federal Holidays when the bank would normally be closed. Each location has a set of services which can be derived from a set of default services. This means list of locations will change depending upon the service requested.
A database will be required to manage the locations, each locations services and appointment times. In addition, a simple UI that will allow an individual to maintain the locations, services and appointment times and see what appointments have been made.

features
-send an email to the requestor with an attached calendar invitation with the details of the appointment
-allow the requestor to :
-select a reason for an appointment (Bank, Hospital)
-select from a list of locations and then a specific date and time.
-create the locations and each location must have a separate set appointment times
-location times can be derived from a default set of appointments with the ability for customization
-appointment times must take into consideration the days of the week (i.e., Saturdays have shorter hours than weekdays.)
-Each location has a set of services which can be derived from a set of default services
-list of locations will change depending upon the service requested.
