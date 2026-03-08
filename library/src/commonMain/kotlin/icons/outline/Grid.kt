package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Grid: ImageVector
    get() {
        if (_Grid != null) {
            return _Grid!!
        }
        _Grid = ImageVector.Builder(
            name = "Outline.Grid",
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
                moveTo(3f, 6.75f)
                curveToRelative(0f, -1.768f, 0f, -2.652f, 0.55f, -3.2f)
                curveTo(4.097f, 3f, 4.981f, 3f, 6.75f, 3f)
                reflectiveCurveToRelative(2.652f, 0f, 3.2f, 0.55f)
                curveToRelative(0.55f, 0.548f, 0.55f, 1.432f, 0.55f, 3.2f)
                reflectiveCurveToRelative(0f, 2.652f, -0.55f, 3.2f)
                curveToRelative(-0.548f, 0.55f, -1.432f, 0.55f, -3.2f, 0.55f)
                reflectiveCurveToRelative(-2.652f, 0f, -3.2f, -0.55f)
                curveTo(3f, 9.403f, 3f, 8.519f, 3f, 6.75f)
                moveToRelative(0f, 10.507f)
                curveToRelative(0f, -1.768f, 0f, -2.652f, 0.55f, -3.2f)
                curveToRelative(0.548f, -0.55f, 1.432f, -0.55f, 3.2f, -0.55f)
                reflectiveCurveToRelative(2.652f, 0f, 3.2f, 0.55f)
                curveToRelative(0.55f, 0.548f, 0.55f, 1.432f, 0.55f, 3.2f)
                reflectiveCurveToRelative(0f, 2.652f, -0.55f, 3.2f)
                curveToRelative(-0.548f, 0.55f, -1.432f, 0.55f, -3.2f, 0.55f)
                reflectiveCurveToRelative(-2.652f, 0f, -3.2f, -0.55f)
                curveTo(3f, 19.91f, 3f, 19.026f, 3f, 17.258f)
                moveTo(13.5f, 6.75f)
                curveToRelative(0f, -1.768f, 0f, -2.652f, 0.55f, -3.2f)
                curveToRelative(0.548f, -0.55f, 1.432f, -0.55f, 3.2f, -0.55f)
                reflectiveCurveToRelative(2.652f, 0f, 3.2f, 0.55f)
                curveToRelative(0.55f, 0.548f, 0.55f, 1.432f, 0.55f, 3.2f)
                reflectiveCurveToRelative(0f, 2.652f, -0.55f, 3.2f)
                curveToRelative(-0.548f, 0.55f, -1.432f, 0.55f, -3.2f, 0.55f)
                reflectiveCurveToRelative(-2.652f, 0f, -3.2f, -0.55f)
                curveToRelative(-0.55f, -0.548f, -0.55f, -1.432f, -0.55f, -3.2f)
                moveToRelative(0f, 10.507f)
                curveToRelative(0f, -1.768f, 0f, -2.652f, 0.55f, -3.2f)
                curveToRelative(0.548f, -0.55f, 1.432f, -0.55f, 3.2f, -0.55f)
                reflectiveCurveToRelative(2.652f, 0f, 3.2f, 0.55f)
                curveToRelative(0.55f, 0.548f, 0.55f, 1.432f, 0.55f, 3.2f)
                reflectiveCurveToRelative(0f, 2.652f, -0.55f, 3.2f)
                curveToRelative(-0.548f, 0.55f, -1.432f, 0.55f, -3.2f, 0.55f)
                reflectiveCurveToRelative(-2.652f, 0f, -3.2f, -0.55f)
                curveToRelative(-0.55f, -0.548f, -0.55f, -1.432f, -0.55f, -3.2f)
            }
        }.build()

        return _Grid!!
    }

@Suppress("ObjectPropertyName")
private var _Grid: ImageVector? = null
