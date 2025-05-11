import React from 'react';

interface Transaction {
    id: number;
    amount: number;
    date: string;
    description: string;
}

interface TransactionsTableProps {
    transactions: Transaction[];
}

const TransactionsTable: React.FC<TransactionsTableProps> = ({ transactions }) => {
    return (
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Amount</th>
                    <th>Date</th>
                    <th>Description</th>
                </tr>
            </thead>
            <tbody>
                {transactions.map(transaction => (
                    <tr key={transaction.id}>
                        <td>{transaction.id}</td>
                        <td>{transaction.amount}</td>
                        <td>{transaction.date}</td>
                        <td>{transaction.description}</td>
                    </tr>
                ))}
            </tbody>
        </table>
    );
};

export default TransactionsTable;