package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.BriefcaseConveyorBelt: ImageVector
    get() {
        if (_BriefcaseConveyorBelt != null) {
            return _BriefcaseConveyorBelt!!
        }
        _BriefcaseConveyorBelt = ImageVector.Builder(
            name = "Outline.BriefcaseConveyorBelt",
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
                moveTo(14.885f, 7.484f)
                horizontalLineToRelative(-5.77f)
                moveToRelative(5.77f, 0f)
                curveToRelative(0f, -4.649f, -5.77f, -4.642f, -5.77f, 0f)
                moveToRelative(5.77f, 0f)
                horizontalLineToRelative(3.461f)
                curveToRelative(0.637f, 0f, 1.154f, 0.545f, 1.154f, 1.216f)
                verticalLineToRelative(6.083f)
                curveToRelative(0f, 0.672f, -0.517f, 1.217f, -1.154f, 1.217f)
                horizontalLineTo(5.654f)
                curveToRelative(-0.637f, 0f, -1.154f, -0.545f, -1.154f, -1.217f)
                verticalLineTo(8.7f)
                curveToRelative(0f, -0.671f, 0.517f, -1.216f, 1.154f, -1.216f)
                horizontalLineToRelative(3.461f)
                moveTo(9f, 19f)
                lineToRelative(1f, 2f)
                moveToRelative(3f, -2f)
                lineToRelative(1f, 2f)
                moveToRelative(3f, -2f)
                lineToRelative(1f, 2f)
                moveToRelative(3f, -2f)
                horizontalLineTo(3f)
                moveToRelative(2f, 0f)
                lineToRelative(1f, 2f)
            }
        }.build()

        return _BriefcaseConveyorBelt!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseConveyorBelt: ImageVector? = null
