import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  return (
    <div>
      <CohortDetails
        name="React Basics"
        status="ongoing"
        duration="4 Weeks"
        trainer="John Doe"
      />
      <CohortDetails
        name="Angular Advanced"
        status="completed"
        duration="6 Weeks"
        trainer="Jane Smith"
      />
      <CohortDetails
        name="Node Js"
        status="On going"
        duration="10 Weeks"
        trainer="Charlie carter"
      />
    </div>
  );
}

export default App;
