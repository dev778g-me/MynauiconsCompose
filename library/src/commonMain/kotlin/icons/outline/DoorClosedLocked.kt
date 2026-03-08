package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.DoorClosedLocked: ImageVector
    get() {
        if (_DoorClosedLocked != null) {
            return _DoorClosedLocked!!
        }
        _DoorClosedLocked = ImageVector.Builder(
            name = "Outline.DoorClosedLocked",
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
                moveTo(13.503f, 11.57f)
                verticalLineTo(9.997f)
                curveToRelative(0f, -2.054f, -3.006f, -1.937f, -3.006f, 0f)
                verticalLineToRelative(1.572f)
                moveTo(6.167f, 20.5f)
                verticalLineToRelative(-15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(7.666f)
                curveToRelative(1.105f, 0f, 2f, 0.892f, 2f, 1.997f)
                verticalLineTo(20.5f)
                moveTo(3.5f, 20.5f)
                horizontalLineToRelative(17f)
                moveTo(9.752f, 11.57f)
                horizontalLineToRelative(4.496f)
                curveToRelative(0.416f, 0f, 0.752f, 0.351f, 0.752f, 0.786f)
                verticalLineToRelative(2.358f)
                curveToRelative(0f, 0.434f, -0.336f, 0.786f, -0.752f, 0.786f)
                horizontalLineTo(9.752f)
                curveToRelative(-0.416f, 0f, -0.752f, -0.352f, -0.752f, -0.786f)
                verticalLineToRelative(-2.358f)
                curveToRelative(0f, -0.435f, 0.336f, -0.787f, 0.752f, -0.787f)
            }
        }.build()

        return _DoorClosedLocked!!
    }

@Suppress("ObjectPropertyName")
private var _DoorClosedLocked: ImageVector? = null
