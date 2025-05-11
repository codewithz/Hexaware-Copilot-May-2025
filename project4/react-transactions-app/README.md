# React Transactions App

This project is a simple React application that fetches transaction data from a local API and displays it in a table format. The data is refreshed every 5 seconds to ensure the displayed information is up-to-date.

## Project Structure

```
react-transactions-app
├── public
│   ├── index.html
├── src
│   ├── components
│   │   ├── TransactionsTable.tsx
│   └── App.tsx
├── package.json
├── tsconfig.json
├── .env
└── README.md
```

## Setup Instructions

1. **Clone the repository:**
   ```
   git clone <repository-url>
   cd react-transactions-app
   ```

2. **Install dependencies:**
   ```
   npm install
   ```

3. **Set up the API:**
   Ensure that the API is running on `localhost:8080/transactions`. You can use a mock server or any backend service that provides transaction data.

4. **Run the application:**
   ```
   npm start
   ```

5. **Open your browser:**
   Navigate to `http://localhost:3000` to view the application.

## Usage

The application will automatically fetch and display transaction data in a table format. The data will refresh every 5 seconds to keep the information current.

## Technologies Used

- React
- TypeScript
- Axios (for API calls)

## License

This project is licensed under the MIT License.