clean:
	find . -name '*.pyc' -delete
	find . -name '*.pyo' -delete
	find . -name '__pycache__' -type d -delete
	rm -rf recursive build/ dist/ .pytest_cache/ .mypy_cache/ *.egg-info htmlcov/ .coverage

coverage:
	@coverage run --source bacraftmanship -m unittest
	@coverage report -m
	@coverage html
	@echo "Se generó del reporte de cobertura en htmlcov/index.html. Intentando abrir con el navegador predeterminado"
	@xdg-open htmlcov/index.html

test:
	python -m unittest --verbose

.PHONY: clean coverage test 
