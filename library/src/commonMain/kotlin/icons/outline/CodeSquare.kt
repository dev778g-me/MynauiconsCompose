package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CodeSquare: ImageVector
    get() {
        if (_CodeSquare != null) {
            return _CodeSquare!!
        }
        _CodeSquare = ImageVector.Builder(
            name = "Outline.CodeSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 9.4f)
                curveToRelative(0f, -2.24f, 0f, -3.36f, 0.436f, -4.216f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.748f, -1.748f)
                curveTo(6.04f, 3f, 7.16f, 3f, 9.4f, 3f)
                horizontalLineToRelative(5.2f)
                curveToRelative(2.24f, 0f, 3.36f, 0f, 4.216f, 0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.748f, 1.748f)
                curveTo(21f, 6.04f, 21f, 7.16f, 21f, 9.4f)
                verticalLineToRelative(5.2f)
                curveToRelative(0f, 2.24f, 0f, 3.36f, -0.436f, 4.216f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, 1.748f)
                curveTo(17.96f, 21f, 16.84f, 21f, 14.6f, 21f)
                horizontalLineTo(9.4f)
                curveToRelative(-2.24f, 0f, -3.36f, 0f, -4.216f, -0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, -1.748f)
                curveTo(3f, 17.96f, 3f, 16.84f, 3f, 14.6f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(14.908f, 9.7f)
                lineToRelative(0.132f, 0.131f)
                curveToRelative(1.022f, 1.022f, 1.534f, 1.534f, 1.534f, 2.169f)
                reflectiveCurveToRelative(-0.512f, 1.146f, -1.534f, 2.169f)
                lineToRelative(-0.132f, 0.132f)
                moveTo(13.072f, 8f)
                lineToRelative(-2.143f, 8f)
                moveTo(9.092f, 9.7f)
                lineToRelative(-0.132f, 0.131f)
                curveTo(7.938f, 10.853f, 7.427f, 11.365f, 7.427f, 12f)
                reflectiveCurveToRelative(0.51f, 1.146f, 1.533f, 2.169f)
                lineToRelative(0.132f, 0.132f)
            }
        }.build()

        return _CodeSquare!!
    }

@Suppress("ObjectPropertyName")
private var _CodeSquare: ImageVector? = null
