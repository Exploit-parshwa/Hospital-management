# Hospital Management System

## Overview
The Hospital Management System is a Java-based application designed to manage doctor records and facilitate user authentication. It provides a graphical user interface (GUI) for adding doctor details, viewing records, and managing user logins.

## Features
- Add doctor details including ID, name, and specialization.
- View and manage doctor records.
- User authentication for secure access.

## Project Structure
```
HospitalManagementSystem
├── src
│   ├── hospital
│   │   ├── addDoctor.java        # GUI for adding doctor details
│   │   ├── DOCTORS.java          # Manages doctor records
│   │   ├── LoginPage.java        # User authentication interface
│   │   └── other_classes.java     # Additional functionalities
├── lib
│   └── dependencies.jar           # External libraries
├── resources
│   └── database.sql              # Database setup scripts
├── .gitignore                     # Git ignore file
├── README.md                      # Project documentation
└── LICENSE                        # Licensing information
```

## Setup Instructions
1. Clone the repository:
   ```
   git clone https://github.com/Exploit-parshwa/Hospital-management.git
   ```
2. Navigate to the project directory:
   ```
   cd HospitalManagementSystem
   ```
3. Ensure you have Java Development Kit (JDK) installed.
4. Compile the Java files in the `src` directory.
5. Run the application.

## Usage
- Launch the application to access the login page.
- Enter your credentials to log in.
- Use the interface to add doctor details and manage records.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.