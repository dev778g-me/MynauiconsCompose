package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Boat: ImageVector
    get() {
        if (_Boat != null) {
            return _Boat!!
        }
        _Boat = ImageVector.Builder(
            name = "Filled.Boat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.55f, 4.997f)
                verticalLineTo(4.8f)
                arcToRelative(2.55f, 2.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.1f, 0f)
                verticalLineToRelative(0.197f)
                horizontalLineTo(7.7f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.75f, 2.75f)
                verticalLineToRelative(3.288f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.486f, 2.947f)
                lineToRelative(0.598f, 3.344f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.476f, -0.264f)
                lineToRelative(-0.597f, -3.344f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.829f, -1.403f)
                lineToRelative(5.829f, -1.977f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.803f, 0f)
                lineToRelative(5.828f, 1.977f)
                curveToRelative(0.585f, 0.198f, 0.938f, 0.795f, 0.83f, 1.404f)
                lineToRelative(-0.598f, 3.343f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.476f, 0.264f)
                lineToRelative(0.598f, -3.344f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.486f, -2.947f)
                verticalLineTo(7.747f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.75f, -2.75f)
                close()
                moveTo(9.868f, 21.251f)
                curveToRelative(-0.892f, -0.312f, -2.004f, -0.298f, -2.854f, 0.056f)
                arcToRelative(5.6f, 5.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.53f, 0.43f)
                curveToRelative(-0.761f, -0.058f, -1.52f, -0.306f, -2.019f, -0.813f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.07f, -1.051f)
                curveToRelative(0.148f, 0.15f, 0.5f, 0.325f, 1.063f, 0.367f)
                arcToRelative(4.1f, 4.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.839f, -0.317f)
                curveToRelative(1.214f, -0.506f, 2.709f, -0.514f, 3.927f, -0.087f)
                arcToRelative(5.08f, 5.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.272f, 0f)
                curveToRelative(1.218f, -0.427f, 2.713f, -0.42f, 3.927f, 0.087f)
                arcToRelative(4.1f, 4.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.84f, 0.318f)
                curveToRelative(0.562f, -0.043f, 0.914f, -0.217f, 1.062f, -0.368f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.07f, 1.051f)
                curveToRelative(-0.498f, 0.507f, -1.258f, 0.755f, -2.02f, 0.812f)
                arcToRelative(5.6f, 5.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.529f, -0.429f)
                curveToRelative(-0.85f, -0.354f, -1.962f, -0.368f, -2.854f, -0.056f)
                arcToRelative(6.58f, 6.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.264f, 0f)
            }
        }.build()

        return _Boat!!
    }

@Suppress("ObjectPropertyName")
private var _Boat: ImageVector? = null
