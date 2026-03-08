package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FileCheck: ImageVector
    get() {
        if (_FileCheck != null) {
            return _FileCheck!!
        }
        _FileCheck = ImageVector.Builder(
            name = "Filled.FileCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 2.25f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(13.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(19.5f, 12f)
                curveToRelative(0f, -1.082f, -0.392f, -2.226f, -0.983f, -3.303f)
                curveToRelative(-0.597f, -1.086f, -1.424f, -2.153f, -2.364f, -3.092f)
                reflectiveCurveToRelative(-2.008f, -1.77f, -3.098f, -2.368f)
                curveToRelative(-1.082f, -0.594f, -2.234f, -0.987f, -3.327f, -0.987f)
                close()
                moveTo(15.092f, 6.665f)
                arcToRelative(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.89f, 2.373f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 9f)
                horizontalLineToRelative(-2.25f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, -1.5f)
                lineTo(12.75f, 5.25f)
                quadToRelative(0f, -0.245f, -0.039f, -0.48f)
                curveToRelative(0.822f, 0.5f, 1.64f, 1.154f, 2.381f, 1.895f)
                moveToRelative(-1.152f, 7.228f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.167f, 1.047f)
                lineToRelative(-2.11f, 2.908f)
                arcToRelative(0.976f, 0.976f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.521f, 0.07f)
                lineToRelative(-1.04f, -1.18f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.127f, -0.991f)
                lineToRelative(0.606f, 0.689f)
                lineToRelative(1.724f, -2.376f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.047f, -0.167f)
            }
        }.build()

        return _FileCheck!!
    }

@Suppress("ObjectPropertyName")
private var _FileCheck: ImageVector? = null
