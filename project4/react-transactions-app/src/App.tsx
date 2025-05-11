import React, { useEffect, useState } from 'react';
import TransactionsTable from './components/TransactionsTable';

const App = () => {
    const [transactions, setTransactions] = useState([]);

    const fetchTransactions = async () => {
        try {
            const response = await fetch('http://localhost:8080/transactions');
            const data = await response.json();
            setTransactions(data);
        } catch (error) {
            console.error('Error fetching transactions:', error);
        }
    };

    useEffect(() => {
        fetchTransactions();
        const interval = setInterval(fetchTransactions, 5000);
        return () => clearInterval(interval);
    }, []);

    return (
        <div>
            <h1>Transaction List</h1>
            <TransactionsTable transactions={transactions} />
        </div>
    );
};

export default App;