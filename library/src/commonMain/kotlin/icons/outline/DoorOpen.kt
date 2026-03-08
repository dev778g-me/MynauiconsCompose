package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.DoorOpen: ImageVector
    get() {
        if (_DoorOpen != null) {
            return _DoorOpen!!
        }
        _DoorOpen = ImageVector.Builder(
            name = "Outline.DoorOpen",
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
                moveTo(6.167f, 20.28f)
                verticalLineTo(5.668f)
                moveToRelative(0f, 14.612f)
                horizontalLineTo(3.5f)
                moveToRelative(2.667f, 0f)
                horizontalLineTo(7f)
                moveToRelative(10.833f, 0f)
                verticalLineTo(5.665f)
                curveToRelative(0f, -1.076f, -0.895f, -1.945f, -2f, -1.945f)
                horizontalLineTo(14f)
                moveToRelative(3.833f, 16.56f)
                horizontalLineTo(14f)
                moveToRelative(3.833f, 0f)
                horizontalLineTo(20.5f)
                moveTo(11f, 12.974f)
                verticalLineToRelative(-1.948f)
                moveTo(6.17f, 3.963f)
                lineToRelative(6.612f, -1.44f)
                curveToRelative(0.625f, -0.135f, 1.218f, 0.328f, 1.218f, 0.952f)
                verticalLineToRelative(17.05f)
                curveToRelative(0f, 0.624f, -0.593f, 1.087f, -1.218f, 0.951f)
                lineToRelative(-6.612f, -1.44f)
                close()
            }
        }.build()

        return _DoorOpen!!
    }

@Suppress("ObjectPropertyName")
private var _DoorOpen: ImageVector? = null
