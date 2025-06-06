function setUserPreferences({
    language = 'English',
    theme = 'Light',
    notifications = true
} = {}) {
    return {
        language,
        theme,
        notifications,
        getPreferences: function() {
            return `Language: ${this.language}, Theme: ${this.theme}, Notifications: ${this.notifications ? 'On' : 'Off'}`;
        }
    };
}

// Example usage:
const user1 = setUserPreferences({ theme: 'Dark' });
console.log(user1.getPreferences()); 

const user2 = setUserPreferences();
console.log(user2.getPreferences());