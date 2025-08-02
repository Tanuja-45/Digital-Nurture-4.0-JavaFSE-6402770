import React from 'react';

function App() {
  const heading = <h1>🏢 Office Space Rental Details</h1>;
  const officeImage = "https://media.istockphoto.com/id/1141421616/photo/this-office-space-is-filled-with-productivity.jpg?s=612x612&w=0&k=20&c=ka6rGPcVkhjC2cG-ICEQaE7mzufJ253bngJPahvBlCg=";
  const office = {
    name: "Innovative Workspace",
    rent: 55000,
    address: "5th Avenue, New York"
  };
  const officeList = [
    { id: 1, name: "Tech Park A", rent: 45000, address: "Mumbai" },
    { id: 2, name: "Business Bay", rent: 67000, address: "Bangalore" },
    { id: 3, name: "Corporate Heights", rent: 62000, address: "Delhi" },
    { id: 4, name: "Startup Spot", rent: 39000, address: "Hyderabad" }
  ];
  const getRentStyle = (rent) => {
    return {
      color: rent < 60000 ? 'red' : 'green',
      fontWeight: 'bold'
    };
  };

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      {heading}
      <img src={officeImage} alt="Office" style={{ width: '400px', borderRadius: '10px', marginBottom: '20px' }} />
      <h2>{office.name}</h2>
      <p>Rent: <span style={getRentStyle(office.rent)}>{office.rent}</span></p>
      <p>Address: {office.address}</p>

      <hr />
      <h2>All Available Spaces</h2>
      {officeList.map(item => (
        <div key={item.id} style={{ border: '1px solid #ccc', padding: '10px', marginBottom: '10px' }}>
          <h3>{item.name}</h3>
          <p>Rent: <span style={getRentStyle(item.rent)}>{item.rent}</span></p>
          <p>Address: {item.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
