# masterThesis
Folder to hold all the necessary code and configuration for my personal Masters thesis

#example CLI Command to start FIS experiments programmatically to remove human intervention
aws fis start-experiment \
    --experiment-template-id {experiment1} | \
aws fis start-experiment \
    --experiment-template-id {experiment2}
