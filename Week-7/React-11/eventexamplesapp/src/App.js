import React from 'react';
import Counter from './components/Counter';
import CurrencyConverter from './components/CurrencyConverter';

function App() {
  return (
    <div className="App" style={{ padding: '20px' }}>
      <h1>React Event Handling Examples</h1>
      <Counter />
      <hr />
      <CurrencyConverter />
    </div>
  );
}

export default App;
