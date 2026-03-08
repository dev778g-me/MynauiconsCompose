package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ListCheck: ImageVector
    get() {
        if (_ListCheck != null) {
            return _ListCheck!!
        }
        _ListCheck = ImageVector.Builder(
            name = "Outline.ListCheck",
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
                moveTo(7.5f, 16.039f)
                lineTo(4.688f, 19.5f)
                lineTo(3f, 18.346f)
                moveToRelative(4.5f, -8.077f)
                lineToRelative(-2.812f, 3.462f)
                lineTo(3f, 12.577f)
                moveTo(7.5f, 4.5f)
                lineTo(4.688f, 7.962f)
                lineTo(3f, 6.808f)
                moveTo(11f, 17.5f)
                horizontalLineToRelative(10f)
                moveTo(11f, 12f)
                horizontalLineToRelative(10f)
                moveTo(11f, 6.5f)
                horizontalLineToRelative(10f)
            }
        }.build()

        return _ListCheck!!
    }

@Suppress("ObjectPropertyName")
private var _ListCheck: ImageVector? = null
