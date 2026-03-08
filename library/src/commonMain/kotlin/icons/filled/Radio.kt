package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Radio: ImageVector
    get() {
        if (_Radio != null) {
            return _Radio!!
        }
        _Radio = ImageVector.Builder(
            name = "Filled.Radio",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.045f, 4.972f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.005f, 1.06f)
                arcTo(8.4f, 8.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.543f, 12f)
                curveToRelative(0f, 2.237f, 0.897f, 4.383f, 2.497f, 5.967f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.056f, 1.066f)
                arcTo(9.9f, 9.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.044f, 12f)
                arcToRelative(9.9f, 9.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.94f, -7.033f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0.005f)
                moveToRelative(11.492f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, -0.005f)
                arcTo(9.9f, 9.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.54f, 12f)
                arcToRelative(9.9f, 9.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.941f, 7.033f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.056f, -1.066f)
                arcTo(8.4f, 8.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.04f, 12f)
                arcToRelative(8.4f, 8.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.497f, -5.967f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.005f, -1.06f)
                moveTo(9.085f, 7.768f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.006f, 1.06f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.984f, 1.456f)
                arcToRelative(4.44f, 4.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.984f, 4.888f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.055f, 1.066f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.313f, -1.943f)
                arcToRelative(5.94f, 5.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.313f, -6.533f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0.006f)
                moveToRelative(5.622f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, -0.006f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.313f, 1.943f)
                arcToRelative(5.94f, 5.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.59f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.313f, 1.943f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.054f, -1.066f)
                curveToRelative(0.421f, -0.417f, 0.755f, -0.912f, 0.983f, -1.456f)
                arcToRelative(4.44f, 4.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.983f, -4.888f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.006f, -1.06f)
                moveTo(9.75f, 12f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.5f, 0f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.5f, 0f)
            }
        }.build()

        return _Radio!!
    }

@Suppress("ObjectPropertyName")
private var _Radio: ImageVector? = null
