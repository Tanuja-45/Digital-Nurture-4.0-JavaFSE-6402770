import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [view, setView] = useState("book");  

  const renderComponent = () =>{
    if (view === "book") {
      return <BookDetails />;
    } else if (view === "blog") {
      return <BlogDetails />;
    } else {
      return <CourseDetails />;
    }
  };

  return (
    <div className="App" style={{ padding: '20px' }}>
      <h1>Blogger Dashboard</h1> 
      <button onClick={() => setView("book")}>Show Books</button>
      <button onClick={() => setView("blog")}>Show Blogs</button>
      <button onClick={() => setView("course")}>Show Courses</button>

      <hr />
      <h3>
        {view === 'book' ? ' Viewing Book Section' :
         view === 'blog' ? ' Viewing Blog Section' :
         ' Viewing Course Section'}
      </h3>
      {view === 'book' && <p>You're now in the Book Component</p>}
      {view === 'blog' && <p>You're now in the Blog Component</p>}
      {view === 'course' && <p>You're now in the Course Component</p>}

      <br />
      {renderComponent()}
    </div>
  );
}

export default App;
