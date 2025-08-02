import React from 'react';

const ListOfPlayers = () => {
  const players = [
    { name: 'Jaiswal', score: 95 },
    { name: 'KL Rahul', score: 112 },
    { name: 'Rishabh Pant', score: 65 },
    { name: 'Shubman Gill', score: 156 },
    { name: 'Karun Nair', score: 45 },
    { name: 'Ravindra Jadeja', score: 78 },
    { name: 'Bumrah', score: 11 },
    { name: 'Siraj', score: 15 },
    { name: 'Arshdeep Singh', score: 20 },
    { name: 'Washington', score: 59 },
    { name: 'Shardhul', score: 35 }
  ];
  const filteredPlayers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players and Scores</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h2>Players with Score less than 70</h2>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListOfPlayers;
