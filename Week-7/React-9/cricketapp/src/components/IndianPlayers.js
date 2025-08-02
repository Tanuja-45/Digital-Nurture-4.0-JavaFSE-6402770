import React from 'react';

const IndianPlayers = () => {
  const allPlayers = [
    'Virat Kohli', 'Rohit Sharma', 'Rishabh Pant',
    'Hardik Pandya', 'KL Rahul', 'Ravindra Jadeja'
  ];
  const [oddPlayer, , oddPlayer2, , oddPlayer3] = allPlayers;
  const [, evenPlayer1, , evenPlayer2, , evenPlayer3] = allPlayers;

  const T20Players = ['Virat Kohli', 'Rishabh Pant'];
  const RanjiPlayers = ['Ajinkya Rahane', 'Cheteshwar Pujara'];
  const allTeam = [...T20Players, ...RanjiPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        <li>{oddPlayer}</li>
        <li>{oddPlayer2}</li>
        <li>{oddPlayer3}</li>
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        <li>{evenPlayer1}</li>
        <li>{evenPlayer2}</li>
        <li>{evenPlayer3}</li>
      </ul>

      <h2>Merged Team (T20+test)</h2>
      <ul>
        {allTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
