CREATE TABLE customers (
                           customer_id VARCHAR(255) PRIMARY KEY,   -- string for customerId
                           customer_name VARCHAR(255),             -- string for customerName
                           creation_date DATE,                     -- string for creationDate (considered as DATE type)
                           dob DATE,                               -- string for dob (considered as DATE type)
                           crn_lob VARCHAR(255),                   -- string for crnLob
                           rm VARCHAR(255),                        -- string for rm
                           branch VARCHAR(255),                    -- string for branch
                           category VARCHAR(255),                  -- string for category
                           segment VARCHAR(255)                    -- string for segment
);

INSERT INTO customers (customer_id, customer_name, creation_date, dob, crn_lob, rm, branch, category, segment)
VALUES
    ('CRN0012937', 'Deepthi Dhulipalla', '2024-05-01', '1998-04-25', 'Retail', 'Alice Smith', 'Branch-101', 'A', 'Premium'),
    ('CRN0012936', 'Jane Smith', '2020-10-20', '1990-12-25', 'Corporate', 'Bob Johnson', 'Branch-102', 'B', 'Standard'),
    ('CRN0012935', 'Emily Johnson', '2022-02-10', '1995-06-30', 'Retail', 'Alice Smith', 'Branch-103', 'C', 'Standard'),
    ('CRN0012938', 'Michael Brown', '2019-11-11', '1980-07-04', 'Retail', 'Charlie Davis', 'Branch-104', 'A', 'Premium'),
    ('CRN0012939', 'Sara Lee', '2021-07-15', '1988-02-18', 'Corporate', 'Bob Johnson', 'Branch-105', 'B', 'Standard'),
    ('CRN0012940', 'David Wilson', '2020-06-22', '1992-10-03', 'Corporate', 'Charlie Davis', 'Branch-106', 'A', 'Premium');