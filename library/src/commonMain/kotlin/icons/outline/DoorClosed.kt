package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.DoorClosed: ImageVector
    get() {
        if (_DoorClosed != null) {
            return _DoorClosed!!
        }
        _DoorClosed = ImageVector.Builder(
            name = "Outline.DoorClosed",
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
                moveTo(6.167f, 20.5f)
                verticalLineToRelative(-15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(7.666f)
                curveToRelative(1.105f, 0f, 2f, 0.892f, 2f, 1.997f)
                verticalLineTo(20.5f)
                moveTo(3.5f, 20.5f)
                horizontalLineToRelative(17f)
                moveTo(15f, 13f)
                verticalLineToRelative(-2f)
            }
        }.build()

        return _DoorClosed!!
    }

@Suppress("ObjectPropertyName")
private var _DoorClosed: ImageVector? = null
