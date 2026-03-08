package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.RoomService: ImageVector
    get() {
        if (_RoomService != null) {
            return _RoomService!!
        }
        _RoomService = ImageVector.Builder(
            name = "Outline.RoomService",
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
                moveTo(12f, 6.167f)
                verticalLineTo(4f)
                moveToRelative(0f, 2.167f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2.833f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                moveTo(3f, 20f)
                horizontalLineToRelative(18f)
            }
        }.build()

        return _RoomService!!
    }

@Suppress("ObjectPropertyName")
private var _RoomService: ImageVector? = null
