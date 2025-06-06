function setReminder(taskName, deadline) {
    const now = new Date();
    const deadlineDate = new Date(deadline);
    
    const timeDiff = deadlineDate - now;
    
    const daysLeft = Math.floor(timeDiff / (1000 * 60 * 60 * 24));
    
    if (timeDiff < 0) {
        console.log(`REMINDER: The deadline for "${taskName}" has passed!`);
    } else {
        console.log(`REMINDER: "${taskName}" is due in ${daysLeft} days (Deadline: ${deadlineDate.toLocaleString()})`);
    }
}

setReminder("Finish project", "2898-06-15");
setReminder("Team meeting", "2025-07-05");
setReminder("Expired task", "2025-01-01");