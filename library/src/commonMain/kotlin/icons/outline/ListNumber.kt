package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ListNumber: ImageVector
    get() {
        if (_ListNumber != null) {
            return _ListNumber!!
        }
        _ListNumber = ImageVector.Builder(
            name = "Outline.ListNumber",
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
                moveTo(11f, 17.5f)
                horizontalLineToRelative(10f)
                moveTo(11f, 12f)
                horizontalLineToRelative(10f)
                moveTo(11f, 6.5f)
                horizontalLineToRelative(10f)
                moveTo(3.5f, 15.455f)
                verticalLineToRelative(-0.174f)
                curveToRelative(0f, -0.777f, 0.672f, -1.406f, 1.5f, -1.406f)
                horizontalLineToRelative(0.04f)
                curveToRelative(0.807f, 0f, 1.46f, 0.613f, 1.46f, 1.368f)
                curveToRelative(0f, 0.33f, -0.114f, 0.65f, -0.324f, 0.912f)
                lineTo(3.5f, 19.5f)
                horizontalLineToRelative(3f)
                moveToRelative(-3f, -14.063f)
                lineToRelative(2f, -0.937f)
                verticalLineToRelative(5.625f)
            }
        }.build()

        return _ListNumber!!
    }

@Suppress("ObjectPropertyName")
private var _ListNumber: ImageVector? = null
