const employees = [];

function addEmployee(name, role, salary = 50000) {
    const employee = {
        name,
        role,
        salary,
        getPublicInfo: function() {
            return `${this.name} - ${this.role}`;
        }
    };
    employees.push(employee);
    console.log(`Added ${name} to the employee database.`);
}

function listEmployees() {
    console.log("Current Employees:");
    employees.forEach(emp => {
        console.log(emp.getPublicInfo());
    });
}

// Example usage:
addEmployee("John Doe", "Developer", 75000);
addEmployee("Jane Smith", "Designer");
listEmployees();