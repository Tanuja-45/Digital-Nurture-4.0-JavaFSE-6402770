import React from "react";
import "./App.css";
import CalculateScore from "./components/CalculateScore";

function App() {
  return (
    <div className="App">
      <CalculateScore name="Thanuja" school="ABC School" total={450} goal={500} />
    </div>
  );
}

export default App;
