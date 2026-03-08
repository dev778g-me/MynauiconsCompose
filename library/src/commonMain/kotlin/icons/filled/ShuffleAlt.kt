package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ShuffleAlt: ImageVector
    get() {
        if (_ShuffleAlt != null) {
            return _ShuffleAlt!!
        }
        _ShuffleAlt = ImageVector.Builder(
            name = "Filled.ShuffleAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.485f, 2.455f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0.03f)
                lineToRelative(2f, 2.118f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.03f)
                lineToRelative(-2f, 2.117f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, 0.03f)
                verticalLineTo(5.869f)
                horizontalLineToRelative(-0.635f)
                curveToRelative(-2.707f, 0f, -5.1f, 2.626f, -5.1f, 6.132f)
                reflectiveCurveToRelative(2.393f, 6.132f, 5.1f, 6.132f)
                horizontalLineToRelative(0.635f)
                verticalLineTo(16.22f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0.03f)
                lineToRelative(2f, 2.118f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.03f)
                lineToRelative(-2f, 2.118f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, 0.03f)
                verticalLineToRelative(-1.913f)
                horizontalLineToRelative(-0.635f)
                curveToRelative(-2.6f, 0f, -4.765f, -1.696f, -5.85f, -4.1f)
                curveToRelative(-1.085f, 2.404f, -3.25f, 4.1f, -5.85f, 4.1f)
                horizontalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(3.15f)
                curveToRelative(2.707f, 0f, 5.1f, -2.626f, 5.1f, -6.132f)
                reflectiveCurveToRelative(-2.393f, -6.132f, -5.1f, -6.132f)
                horizontalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(3.15f)
                curveToRelative(2.6f, 0f, 4.765f, 1.696f, 5.85f, 4.1f)
                curveToRelative(1.085f, -2.404f, 3.25f, -4.1f, 5.85f, -4.1f)
                horizontalLineToRelative(0.635f)
                close()
            }
        }.build()

        return _ShuffleAlt!!
    }

@Suppress("ObjectPropertyName")
private var _ShuffleAlt: ImageVector? = null
