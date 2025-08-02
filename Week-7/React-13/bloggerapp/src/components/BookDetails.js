import React from 'react';

function BookDetails() {
  const books = [
    { id: 1, title: 'React in Depth', author: 'Dan Abramov' },
    { id: 2, title: 'Learn JavaScript', author: 'Kyle Simpson' },
    { id: 3, title: 'Clean Code', author: 'Robert C. Martin' }
  ];

  return (
    <div>
      <h2> Book Details</h2>
      <ul>
        {books.map(book => (
          <li key={book.id}>
            <strong>{book.title}</strong> by {book.author}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default BookDetails;
