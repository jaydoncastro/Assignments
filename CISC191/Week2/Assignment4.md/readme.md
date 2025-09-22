# Change Contents in a Text File

## Objective
Understand how to edit contents in a text file.

---

## Flowchart of Thought Process
```mermaid
flowchart TD
    A[Start] --> B[Input filename e.g., ParkPhotos.txt]
    B --> C[Open the file]
    C --> D{File empty?}
    D -- Yes --> E[End program]
    D -- No --> F[Read each line]
    F --> G[Replace "_photo.jpg" with "_info.txt"]
    G --> H[Print modified filename]
    H --> I{More lines?}
    I -- Yes --> F
    I -- No --> J[End]
