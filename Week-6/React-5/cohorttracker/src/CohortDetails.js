import React from 'react';
import styles from './CohortDetails.module.css';

function CohortDetails({ name, status, duration, trainer }) {
  return (
    <div className={styles.box}>
      <h3 style={{ color: status === 'ongoing' ? 'green' : 'blue' }}>{name}</h3>
      <dl>
        <dt>Status:</dt>
        <dd>{status}</dd>
        <dt>Duration:</dt>
        <dd>{duration}</dd>
        <dt>Trainer:</dt>
        <dd>{trainer}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
