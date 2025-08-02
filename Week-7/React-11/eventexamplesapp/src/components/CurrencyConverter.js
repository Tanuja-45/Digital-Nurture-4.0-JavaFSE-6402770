import React, { useState } from 'react';

function CurrencyConverter() {
  const [rupees, setRupees] = useState('');
  const [euro, setEuro] = useState('');
  const handleSubmit = (e) => {
    e.preventDefault();
    const rate = 90; 
    const converted = (parseFloat(rupees) / rate).toFixed(2);
    setEuro(converted);
  };

  return (
    <div>
      <h2>Currency Converter (INR to EUR)</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          placeholder="Enter amount in INR"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
          required
        />
        <button type="submit">Convert</button>
      </form>
      {euro && (
        <p>
          <strong>EUR:</strong> {euro}
        </p>
      )}
    </div>
  );
}

export default CurrencyConverter;
