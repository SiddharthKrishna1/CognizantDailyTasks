function createEmployeeProfile(name, jobTitle = "Team Member", department, joiningDate = new Date()) {
    return {
        name: name,
        jobTitle: jobTitle,
        department: department,
        joiningDate: new Date(joiningDate),
        
        getProfile: function() {
            return `${this.name} - ${this.jobTitle}`;
        },
        
        generateEmail: function() {
            const formattedDate = this.joiningDate.toLocaleDateString('en-US', {
                year: 'numeric', 
                month: 'long', 
                day: 'numeric'
            });
            
            return `Dear ${this.name},\n\nWelcome to the ${this.department} team! ` +
                   `Your joining date is ${formattedDate}.\n\nBest regards,\nHR Department`;
        }
    };
}

const employee1 = createEmployeeProfile(
    "John Doe", 
    "Software Engineer", 
    "Engineering", 
    "2025-06-15"
);

console.log(employee1.getProfile()); 


console.log(employee1.generateEmail());

const employee2 = createEmployeeProfile(
    "Jane Smith", 
    undefined, 
    "Marketing",
    "2025-07-01"
);

console.log(employee2.getProfile()); 


console.log(employee2.generateEmail());
