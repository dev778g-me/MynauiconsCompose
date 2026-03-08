package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Wheelchair: ImageVector
    get() {
        if (_Wheelchair != null) {
            return _Wheelchair!!
        }
        _Wheelchair = ImageVector.Builder(
            name = "Filled.Wheelchair",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.938f, 3.938f)
                arcToRelative(2.35f, 2.35f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.675f, 3.783f)
                lineToRelative(0.628f, 5.654f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.263f, 0.222f)
                lineToRelative(5.043f, -0.288f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.848f, 1.668f)
                lineToRelative(0.11f, 2.434f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.25f, 0.239f)
                horizontalLineTo(19f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-0.244f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.749f, -1.67f)
                lineToRelative(-0.11f, -2.435f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.264f, -0.239f)
                lineToRelative(-5.044f, 0.289f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.75f, 13.54f)
                lineTo(9.123f, 7.9f)
                arcToRelative(2.35f, 2.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.185f, -3.963f)
                moveTo(12f, 10.4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                moveToRelative(-3.518f, 0.122f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.37f, 0.995f)
                arcToRelative(4.05f, 4.05f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.61f, 4.696f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.453f, 0.374f)
                arcTo(5.552f, 5.552f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.25f, 15.2f)
                arcToRelative(5.55f, 5.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.237f, -5.046f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.995f, 0.368f)
            }
        }.build()

        return _Wheelchair!!
    }

@Suppress("ObjectPropertyName")
private var _Wheelchair: ImageVector? = null
