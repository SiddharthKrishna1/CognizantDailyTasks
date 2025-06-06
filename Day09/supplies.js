const officeSupplies = [
    { name: "Pens", quantity: 50 },
    { name: "Notepads", quantity: 30 },
    { name: "Staplers", quantity: 5 }
];

function addSupply(name, quantity = 1) {
    const existingItem = officeSupplies.find(item => item.name === name);
    if (existingItem) {
        existingItem.quantity += quantity;
    } else {
        officeSupplies.push({ name, quantity });
    }
    console.log(`Added ${quantity} ${name}(s) to inventory.`);
}

function removeSupply(name, quantity = 1) {
    const itemIndex = officeSupplies.findIndex(item => item.name === name);
    if (itemIndex !== -1) {
        if (officeSupplies[itemIndex].quantity <= quantity) {
            officeSupplies.splice(itemIndex, 1);
            console.log(`Removed all ${name} from inventory.`);
        } else {
            officeSupplies[itemIndex].quantity -= quantity;
            console.log(`Removed ${quantity} ${name}(s) from inventory.`);
        }
    } else {
        console.log(`${name} not found in inventory.`);
    }
}

function displayInventory() {
    console.log("Current Office Supplies Inventory:");
    officeSupplies.forEach(item => {
        console.log(`${item.name}: ${item.quantity}`);
    });
}

// Example usage:
addSupply("Pens", 10);
addSupply("Markers", 5);
removeSupply("Notepads", 10);
displayInventory();