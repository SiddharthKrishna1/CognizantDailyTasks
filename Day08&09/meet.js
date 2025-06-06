const meetingParticipants = [];

function addParticipant(name) {
    meetingParticipants.push(name);
    console.log(`${name} added to the meeting. Current participants: ${meetingParticipants.join(', ')}`);
}

function showParticipants() {
    console.log("Current Meeting Participants:");
    meetingParticipants.forEach((participant, index) => {
        console.log(`${index + 1}. ${participant}`);
    });
}

addParticipant("Mahesh");
addParticipant("Bob");
showParticipants();